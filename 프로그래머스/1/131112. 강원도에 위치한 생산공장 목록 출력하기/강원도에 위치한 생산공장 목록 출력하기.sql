-- 코드를 입력하세요

-- 출력 : id,이름,주소
-- 조건 : 강원도 위치, 식품공장,
-- 정렬 : 공장id 오름차순

SELECT F.FACTORY_ID, F.FACTORY_NAME, F.ADDRESS
FROM FOOD_FACTORY AS F
WHERE F.ADDRESS like ("강원도%")
order by F.FACTORY_ID;