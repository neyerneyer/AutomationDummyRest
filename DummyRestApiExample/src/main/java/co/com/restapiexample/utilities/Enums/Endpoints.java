package co.com.restapiexample.utilities.Enums;

public enum Endpoints {
    ENDPOINT_BASE("https://dummy.restapiexample.com/api/v1"),
    ENDPOINT_GET_EMPLOYEES("/employees"),
    ENDPOINT_POST_CREATE_EMPLOYEE("https://dummy.restapiexample.com/api/v1/create"),
    ENDPOINT_GET_EMPLOYEE("/employee/{id}"),
    ENDPOINT_DELETE_EMPLOYEE("/delete/{id}");

    private final String uri;

    Endpoints(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}