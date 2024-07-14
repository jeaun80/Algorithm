-- 코드를 입력하세요
-- 출력 : 분류, 가격, 이름
-- 조건 : 1. 카테고리별 가장 비싼 식품 2. 카테고리는 과자 국 김치 식용유만 
-- 정렬 : 식품가격기준 내림차순 정렬
-- 카테고리만 남기고 맥스 테이블 생성 조건 카테고리가 부모 카테고리와 같은거해서 id만 출력
-- 
SELECT FR.CATEGORY, FR.PRICE, FR.PRODUCT_NAME
FROM FOOD_PRODUCT AS FR
WHERE FR.PRICE  = 
    (SELECT MAX(PRICE)
     FROM FOOD_PRODUCT AS F 
     WHERE F.CATEGORY = FR.CATEGORY AND F.CATEGORY IN ('국','과자','김치','식용유')
     GROUP BY F.CATEGORY)
ORDER BY FR.PRICE DESC

# SELECT * FROM FOOD_PRODUCT AS F 
#      WHERE  F.CATEGORY IN ('국','과자','김치','식용유')
#      # GROUP BY F.CATEGORY