-- 코드를 입력하세요
-- 출력 : 첨부파일경로(/home/grep/src/boardId/file_id+fileName+fileext)
-- 조건 : 조회수가 제일 높은 게시물
-- 정렬 : 파일id기준
SELECT CONCAT("/home/grep/src/",UF.BOARD_ID,"/",UF.FILE_ID,UF.FILE_NAME,UF.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD AS UB JOIN USED_GOODS_FILE AS UF ON UB.BOARD_ID = UF.BOARD_ID
WHERE UB.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY UF.FILE_ID DESC