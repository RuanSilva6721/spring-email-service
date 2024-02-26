package com.ms.email.dtos;

import java.util.UUID;

public record EmailDTO(UUID userID,
                       String emailTo,
                       String subject,
                       String text

                       ) {
}
