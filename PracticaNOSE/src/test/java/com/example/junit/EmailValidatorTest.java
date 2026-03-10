package com.example.junit;

import org.junit.Test;
import org.junit.Assert;

public class EmailValidatorTest {
    private final EmailValidator validator = new EmailValidator();

    @Test
    public void testEmailValid() {
        Assert.assertTrue("Email básico válido", validator.isValid("example@example.com"));
        Assert.assertTrue("Email con punto en el nombre y dominio .es", validator.isValid("user.name@domain.es"));
    }

    @Test
    public void testEmailInvalid() {
        Assert.assertFalse("Email sin @", validator.isValid("plainaddress"));
        Assert.assertFalse("Email sin nombre de usuario", validator.isValid("@missingusername.com"));
        Assert.assertFalse("Email con dominio vacío", validator.isValid("username@.com"));
        Assert.assertFalse("Un email nulo no debería ser válido", validator.isValid(null));
    }
}
