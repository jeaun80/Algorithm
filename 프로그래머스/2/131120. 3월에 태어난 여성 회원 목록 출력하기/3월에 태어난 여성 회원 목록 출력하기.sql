-- 코드를 

-- 출력 : 
-- 조건 : 전화번호 null인경우 제외
-- 정렬 : 회워ㄴid 오른차순

SELECT M.MEMBER_ID, M.MEMBER_NAME,M.GENDER,DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') as DATE_OF_BIRTH
fROM MEMBER_PROFILE as M
where M.TLNO is not NULL and MONTH(M.DATE_OF_BIRTH) = '03' and M.GENDER = 'W'
order by M.MEMBER_ID