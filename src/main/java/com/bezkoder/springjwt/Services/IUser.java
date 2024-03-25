package com.bezkoder.springjwt.Services;

import com.bezkoder.springjwt.models.ChangePasswordRequest;

import java.security.Principal;

public interface IUser {
    public String resetPassword(String token, String password);
    public String forgotPassword(String email);
}
