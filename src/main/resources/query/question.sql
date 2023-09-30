USE coyukdae;

CREATE TABLE questions
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    created_at     datetime              NULL,
    modified_at    datetime              NULL,
    question_level VARCHAR(255)          NOT NULL,
    question_type  VARCHAR(255)          NOT NULL,
    description    VARCHAR(255)          NOT NULL,
    answer         VARCHAR(32)           NOT NULL,
    CONSTRAINT pk_questioninfo PRIMARY KEY (id)
);