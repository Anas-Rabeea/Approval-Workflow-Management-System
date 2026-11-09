package dev.anascoding.approval_sys.api.request.service;

import dev.anascoding.approval_sys.api.request.repo.RequestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RequestService
{
    private final RequestRepository requestRepository;







}
