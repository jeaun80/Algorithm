-- 코드를 입력하세요
-- 출력 : 장바구니 아이디
-- 조건 : 우유와 요거트 동시구입, 행은 아이템별로 있다.
-- 정렬 : 장바구니 아이디순
-- 그룹바이 카트아이디 하고 윈도우함수에 sum이 문자열도 되는지 확인 해볼까 
-- 요거트 행 만 있는 테이블생성
-- 우유만 행 만 있는 테이블 생성
-- 조인해서 카트아이디가 겹치면 는거만 오케이

WITH YO AS
(SELECT CART_ID FROM CART_PRODUCTS WHERE NAME = 'Yogurt'),
MI AS
(SELECT CART_ID FROM CART_PRODUCTS WHERE NAME = 'Milk')

SELECT YO.CART_ID
FROM YO INNER JOIN MI ON YO.CART_ID = MI.CART_ID
GROUP BY YO.CART_ID
ORDER BY CART_ID

# GROUP BY CART_ID