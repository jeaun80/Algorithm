-- 코드를 입력하세요

# 출력 게시글제목, 댓글 id 등
# 조건 2022년도 10월에 작성
# 정렬 1차 댓글작성날 오름차순 2차 게시글제목 기준 오름차순
SELECT b.TITLE,b.BOARD_ID,r.REPLY_ID,r.WRITER_ID,r.CONTENTS,DATE_FORMAT(r.CREATED_DATE,'%Y-%m-%d')
FROM USED_GOODS_BOARD as b join USED_GOODS_REPLY as r on b.BOARD_ID = r.BOARD_ID 
where b.CREATED_DATE between '2022-10-01' and '2022-10-31'
order by r.CREATED_DATE,b.TITLE