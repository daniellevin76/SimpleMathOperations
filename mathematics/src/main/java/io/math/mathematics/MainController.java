package io.math.mathematics;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    NrBean nrBean;

    @RequestMapping(method = RequestMethod.GET, value = "getVal")
    public ArrayList<Double> getValue(@RequestParam(defaultValue = "-9999999") String numbers) {
        Double dblNumber;
        ArrayList<Double> dblArr = new ArrayList<Double>();

        String[] strNumbers = numbers.split(",");
        for (int i = 0; i < strNumbers.length; i++) {
            dblNumber = Double.parseDouble(strNumbers[i]);
            dblArr.add(i, dblNumber);
            nrBean = new NrBean(dblArr);
        }
        return dblArr;

    }

    @RequestMapping(path = "product")
    public String returnProduct() {
        return nrBean.mult().toString();
    }

    @RequestMapping(path = "sum")
    public String returnSum() {
        return nrBean.sum().toString();
    }

    @RequestMapping(path = "diff")
    public String returndDiff() {
        String outPut;
        Double difference = nrBean.diff();
        if (difference == -9999999.99) {
            outPut = "Difference operation takes only two numbers at a time";
        }

        else {
            outPut = nrBean.diff().toString();
        }
        return outPut;

    }

    /*
     * @RequestMapping(value = "/getValues", method = RequestMethod.GET, produces =
     * MediaType.APPLICATION_JSON_VALUE) public String createJSNFile(){ String
     * pattern = "{ \"num1\":\"%s\",\"num2\":\"%s\",\"num3\":\"%s\"}"; return
     * String.format(pattern, nrBean.getFrstNr(), nrBean.getScndNr(), nrBean.sum());
     * 
     * }
     */

}
