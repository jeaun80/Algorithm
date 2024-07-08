-- 코드를 입력하세요
-- 출력 : id, 이름, 코드 분류 가격
-- 조건 : 가격이 가장 비싼 식품
-- 정렬 : x

SELECT *
FROM FOOD_PRODUCT
WHERE PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT)

