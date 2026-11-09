package dev.anascoding.approval_sys.common.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword,String>
{
    private static final String PASSWORD_REGEX =
      "^(?=.*[a-z])" +
        "(?=.*[A-Z])" +
        "(?=.*\\d)" +
        "(?=.*[@$!%*?&])" +
        "[A-Za-z\\d@$!%*?&]{10,}$";
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        // make @NotNull and @NotBlank handle the NULL Values
        if (value == null)
        {
            return true;
        }
        return value.matches(PASSWORD_REGEX);
    }
}
