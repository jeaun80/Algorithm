-- 코드를 입력하세요
-- 출력 : id, 출판일
-- 조건 : 시간 - 2021년도, 카테고리 - 인문
-- 테이블 : book
# -- 정렬 : 출판일 오름차순
# SELECT BOOK_ID, PUBLISHED_DATE
# FROM BOOK
# WHERE CATEGORY = '인문'
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
-- 코드를 입력하세요
SELECT  BOOK_ID
        ,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
  FROM  BOOK
 WHERE  YEAR(PUBLISHED_DATE) = 2021 AND
        CATEGORY = '인문'
 ORDER
    BY  PUBLISHED_DATE
;