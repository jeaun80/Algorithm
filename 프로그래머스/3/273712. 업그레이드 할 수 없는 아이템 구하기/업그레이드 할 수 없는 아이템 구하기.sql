-- 코드를 작성해주세요

-- 출력 : item id, itme name, itme 희귀도
-- 조건 : root아이템 -> 패런츠아이템아이디가 null 
-- 정렬 : id 내림차순

SELECT  II.ITEM_ID,II.ITEM_NAME,II.RARITY
FROM ITEM_INFO AS II
WHERE  II.ITEM_ID NOT IN (SELECT PARENT_ITEM_ID FROM ITEM_TREE WHERE NOT ISNULL(PARENT_ITEM_ID))
ORDER BY II.ITEM_ID DESC