package Modelos;

import java.util.Map;

public class ConversaoResponse {

    private String base_code;
    private Map<String, Double> conversion_rates;
    private  String result;
    private  String error_type;

    public String getBase_code() {
        return base_code;
    }

    public String getResult() {
        return result;
    }

    public String getError_type() {
        return error_type;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

}
