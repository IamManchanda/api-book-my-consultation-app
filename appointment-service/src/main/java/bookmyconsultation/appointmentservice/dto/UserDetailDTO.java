package bookmyconsultation.appointmentservice.dto;

public class UserDetailDTO {

    private String id;

    private String firstName;

    private String lastName;

    private String dob;

    private String mobile;

    private String emailId;

    private String createdDate;

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}
