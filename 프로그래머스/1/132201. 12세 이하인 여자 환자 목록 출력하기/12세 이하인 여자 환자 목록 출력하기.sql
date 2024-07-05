-- 코드를 입력하세요

-- 출력 : 이름 번호 성별 나이 번호
-- 조건 : 12세 이하, 여자환자, 전화번호 null일경우 none출력
-- 정렬 : 나이 내림차순 이름 오름
SELECT P.PT_NAME, P.PT_NO, P.GEND_CD,P.AGE, IFNULL(P.TLNO,'NONE')
FROM PATIENT AS P
WHERE P.AGE <= 12 AND P.GEND_CD = 'W'
ORDER BY P.AGE DESC, P.PT_NAME ASC;