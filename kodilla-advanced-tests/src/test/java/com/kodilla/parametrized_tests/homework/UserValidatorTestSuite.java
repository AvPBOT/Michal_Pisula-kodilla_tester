package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"A", "1", "Ab", "A1"})
    public void shouldReturnFalseWhenUsernameBelowThreeChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Av(&^", "A@#%"})
    public void shouldReturnFalseWhenUsernameContainsForbiddenChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user", "USER", "User123", "User_456", "UsEr-789", "USER.123", "0123", "-._"})
    public void shouldReturnTrueWhenUsernameSatisfiesTheStandard(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailNull(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"use@r1@gmail.com", "u$er!@hotmail.com", "us,.r@yahoo.com"})
    public void shouldReturnFalseWhenForbiddenCharsInUserId(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"@gmail.com", "@hotmail.com", "@yahoo.com"})
    public void shouldReturnFalseWhenUserIdIsEmpty(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user1@gm@il.com", "user2@hotmail.c0m", "user3@yah$$.c+-"})
    public void shouldReturnFalseWhenForbiddenCharsInDomainName(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"user1@.com", "user2@hotmail", "user3@"})
    public void shouldReturnFalseIfDomainNameIsMissing(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"user1@gmail.comasda", "user2@hotmail.compoilkjz", "user3@yahoo.comqwertya"})
    public void shouldReturnFalseIfTooManyCharsInDomain(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"UsEr_1@gmail.com", "US3r-2@hotmail.com", "xXxuS3rxXx45126@yahoo.com"})
    public void shouldReturnTrueIfEmailSatisfiesTheStandard(String email) {
        assertTrue(validator.validateEmail(email));
    }
}