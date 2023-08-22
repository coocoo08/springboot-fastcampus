package org.example.password;

import org.example.ch02.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {


    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
