package vn.plusplusc.ecommerce.exception;

import java.util.List;

import vn.plusplusc.ecommerce.api.response.util.APIStatus;
import vn.plusplusc.util.Constant;

/**
*
* @author manhcuong
*/
// Unchecked exception
public class ApplicationException extends RuntimeException {

    private APIStatus apiStatus;
    private List<Constant.ParamError> data;

    public ApplicationException(APIStatus apiStatus) {
        this.apiStatus = apiStatus;
    }

    /**
     * This constructor is builded only for handling BAD REQUEST exception
     * Careful when use it with other purpose ;)
     *
     * @param apiStatus
     * @param data
     */
    public ApplicationException(APIStatus apiStatus, List<Constant.ParamError> data) {
        this(apiStatus);
        this.data = data;
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public APIStatus getApiStatus() {
        return apiStatus;
    }

    public List<Constant.ParamError> getData() {
        return data;
    }

}
