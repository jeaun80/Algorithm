-- 코드를 작성해주세요

-- 출력 id 메일 이름 성
-- 조건 : 파이썬스킬 보유자
-- 정렬 : id기준 오름차순

SELECT D.ID,D.EMAIL,D.FIRST_NAME ,D.LAST_NAME
FROM DEVELOPER_INFOS AS D
WHERE D.SKILL_1 = 'Python' OR  D.SKILL_2 = 'Python' OR  D.SKILL_3 = 'Python'
ORDER BY D.ID
