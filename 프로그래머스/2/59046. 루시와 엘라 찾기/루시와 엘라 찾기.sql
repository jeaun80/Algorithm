-- 코드를 입력하세요
-- 출력 : 아이디 이름 성별 중성화
-- 조건 : 이름이 ~~인
-- 정렬 : 아이디 순

SELECT A.ANIMAL_ID, A.NAME, A.SEX_UPON_INTAKE
FROM ANIMAL_INS AS A
WHERE A.NAME = 'Ella' OR A.NAME = 'Lucy' OR A.NAME = 'Pickle' OR A.NAME = 'Rogan' OR A.NAME = 'Sabrina' OR A.NAME = 'Mitty'
ORDER BY A.ANIMAL_ID