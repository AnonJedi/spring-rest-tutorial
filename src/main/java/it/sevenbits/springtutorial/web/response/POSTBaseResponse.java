package it.sevenbits.springtutorial.web.response;

import java.util.Collection;

public class POSTBaseResponse<T> extends BaseResponse {
    private Collection<T> data = null;

    public POSTBaseResponse(Boolean success, String error, Collection<T> data) {
        super(success, error);
        this.data = data;
    }

    public POSTBaseResponse(Boolean success, String error) {
        super(success, error);
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "POSTBaseResponse{" +
                "success=" + getSuccess() +
                ", error='" + getError() + '\'' +
                ", data=" + data +
            '}';
    }
}
