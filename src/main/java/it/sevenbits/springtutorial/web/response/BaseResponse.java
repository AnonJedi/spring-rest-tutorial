package it.sevenbits.springtutorial.web.response;

public class BaseResponse {
    private Boolean success = false;
    private String error = null;

    public BaseResponse(Boolean success, String error) {
        if (success != null) {
            this.success = success;
        }
        this.error = error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}
