package org.example.password;

import org.example.ch02.PasswordGenerator;

public class WrongPasswordGenerator implements PasswordGenerator {


    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
