INSERT INTO USER (ID, USERID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (1, 'kksj216', '1234', 'SujinKwon', '21900044@handong.edu', CURRENT_TIMESTAMP());
INSERT INTO USER (ID, USERID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (2, 'jiny', '1234', 'KwonSujin', '219@handong.edu', CURRENT_TIMESTAMP());

INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (1, 1, '제발 되라!', '되었으면 좋겠다. ', CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (2, 1, '이게될까?!', '으ㅏ. ', CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (3, 2, '울고싶다!', '슬퍼 ', CURRENT_TIMESTAMP(), 0);
