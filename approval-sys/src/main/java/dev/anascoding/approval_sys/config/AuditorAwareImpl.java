package dev.anascoding.approval_sys.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String>
{
    @Override
    public Optional<String> getCurrentAuditor()
    {
        // get the user from the JWT utils to get the userdetails object and then the username
        return Optional.of("Admin");
    }
}
