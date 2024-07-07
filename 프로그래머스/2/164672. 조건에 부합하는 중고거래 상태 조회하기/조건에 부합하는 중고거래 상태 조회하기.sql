-- 코드를 입력하세요
-- 출력 : 게시글 아이디 작성자 아이디 제목, 가격 거래상태
-- 조건 : 2022 10 5 등록, 거래상태따라 분류 출력
-- 정렬 : 게시글 아이디 내림차순
SELECT U.BOARD_ID,U.WRITER_ID,U.TITLE,U.PRICE,
CASE 
WHEN U.STATUS = 'DONE' THEN '거래완료'
WHEN U.STATUS = 'SALE' THEN '판매중'
WHEN U.STATUS = 'RESERVED' THEN '예약중'
END AS 'STATUS'
FROM USED_GOODS_BOARD AS U
WHERE U.CREATED_DATE = '2022-10-05'
ORDER BY U.BOARD_ID desc
