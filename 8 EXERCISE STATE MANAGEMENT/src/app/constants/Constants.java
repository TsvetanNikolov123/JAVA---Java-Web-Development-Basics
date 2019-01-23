package app.constants;

public final class Constants {

    private Constants(){

    }

    public static final String HTTP_REQUEST_SPLIT_DELIMITER = "\\s+";
    public static final String HTTP_REQUEST_HEADER_DELIMITER = ": ";
    public static final String HTTP_REQUEST_BODY_DELIMITER = "&";
    public static final String HTTP_REQUEST_BODY_KVP_DELIMITER = "=";
    public static final String HTTP_HEADER_COOKIE = "Cookie";
    public static final String HTTP_REQUEST_HEADER_COOKIE_DELIMITER = "; ";

    public static final String OUTPUT_COOKIE_PATTERN = "%s <-> %s";
}
