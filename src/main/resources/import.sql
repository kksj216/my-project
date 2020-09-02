INSERT INTO USER (ID, USERID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (1, 'kksj216', '1234', 'SujinKwon', '21900044@handong.edu', CURRENT_TIMESTAMP());
INSERT INTO USER (ID, USERID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (2, 'jiny', '1234', 'KwonSujin', '219@handong.edu', CURRENT_TIMESTAMP());
INSERT INTO USER (ID, USERID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (3, 'one_weekhi', '1234', 'HanJuihi', '216@handong.edu', CURRENT_TIMESTAMP());

INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (1, 1, '[전산전자공학부] 데이터 구조 (2분반)', '데이터구조 2분반 김영섭교수님 수업듣는 분들 중 스터디 같이하실 분 모집합니다! 함께하실 분 댓글로 메일주소를 알려주세요~ <br>(4명까지 받을 예정)', CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (2, 3, '[전산전자공학부] 자바프로그래밍 (2분반)', '자바프로그래밍 남재창교수님 1분반 수업듣는 분들 중 스터디 하실 분 모집합니다~~ 댓글로 메일을 남겨주세요. ', CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (3, 2, '[경영경제학부] 경영경제통계 (1분반)', '경경통 김우성교수님 1분반 스터디 같이 하실분 모집합니다. 댓글로 메일을 남겨주세요. ', CURRENT_TIMESTAMP(), 0);
