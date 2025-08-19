package com.api.forumHub.domain.topic;

import com.api.forumHub.domain.answer.AnswerResponseDTO;
import com.api.forumHub.domain.user.UserResponseDTO;

import java.time.LocalDateTime;
import java.util.List;

public record TopicResponseDTO(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate,
        TopicStatus status,
        Long courseId,
        UserResponseDTO author,
        List<AnswerResponseDTO> answers
        ) {
}

