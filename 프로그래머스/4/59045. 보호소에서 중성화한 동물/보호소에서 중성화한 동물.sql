-- 코드를 입력하세요
-- 출력 : 동물아이디, 생물종, 이름
-- 조건 : 1. 보호소들어올때는 중성화 x 2. 보호소에서 나갈때는 중성화 o
-- 정렬 : 아이디순
-- 테이블 : 보호소 전입 테이블, 보호소 전출 테이블 
-- 1. 전입테이블에서 중성화안된 동물만 남긴다.
-- 2. 전출테이블에서 중성화된 동물만 남긴다
-- 3. 1과 2 애니멀id 이너조인 실시한다.
-- 4. 출력한다.

WITH IT AS 
(SELECT ANIMAL_ID,ANIMAL_TYPE,NAME FROM ANIMAL_INS WHERE SEX_UPON_INTAKE LIKE 'Intact%'),
OT AS
(SELECT ANIMAL_ID FROM ANIMAL_OUTS WHERE SEX_UPON_OUTCOME LIKE 'Spayed%' OR SEX_UPON_OUTCOME LIKE 'Neutered%')

SELECT IT.animal_id,IT.ANIMAL_TYPE, IT.NAME
FROM OT INNER JOIN IT ON it.ANIMAL_ID = ot.ANIMAL_ID
ORDER BY IT.ANIMAL_ID