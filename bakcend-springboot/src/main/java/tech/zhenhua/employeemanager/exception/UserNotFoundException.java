package tech.zhenhua.employeemanager.exception;

/**
 * @author
 * @create 2022-02-13-12:54 PM
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
