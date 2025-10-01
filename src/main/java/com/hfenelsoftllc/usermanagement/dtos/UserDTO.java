package com.hfenelsoftllc.usermanagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    public Long Id;
    public String FirstName;
    public String LastName;
    public String Address;
    public String Email;
    public String Password;
    public String ConfirmPassword;
}
