-- 코드를 입력하세요
-- 출력 : 회원 이름, 리뷰 텍스트, 리뷰작성일yyyy--mm--dd
-- 조건 : 리뷰를 가장 많이 작성한 회원들의 리뷰
-- 정렬 : 리뷰작성일 오름차순 텍트스 기준 오름차순
-- 테이블 리뷰 작성횟수 가장큰거

-- 리뷰작성횟수가 가장큰 회원 회원 
-- 

WITH C AS
    (SELECT MEMBER_ID,(COUNT(MEMBER_ID)) AS CNT
     FROM REST_REVIEW
     GROUP BY MEMBER_ID),
M AS
    (SELECT MAX(CNT) AS MAX_CNT
     FROM C)


SELECT  MR.MEMBER_NAME,RR.REVIEW_TEXT,DATE_FORMAT(RR.REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
FROM C JOIN M ON C.CNT = M.MAX_CNT JOIN REST_REVIEW AS RR ON C.MEMBER_ID = RR.MEMBER_ID JOIN MEMBER_PROFILE AS MR ON MR.MEMBER_ID = C.MEMBER_ID
ORDER BY REVIEW_DATE,RR.REVIEW_TEXT
