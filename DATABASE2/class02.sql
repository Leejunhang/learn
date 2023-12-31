-- 부서 번호가 20이거나 직업이 SALESMAN인 사원 정보 출력
SELECT *
FROM EMP
WHERE DEPTNO = 20 OR JOB = 'SALESMAN';

-- 직업이 'MANAGER', 'SALESMAN', 'CLERK'들이 아닌 사원 정보 출력
SELECT *
FROM EMP
--주석
/*WHERE JOB != 'MANAGER' AND JOB != 'SALESMAN' AND JOB != 'CLERK';*/
WHERE NOT(JOB = 'MANAGER' OR JOB = 'SALESMAN' OR JOB = 'CLERK');

-- 직업에 'A'가 들어간 사원 정보 출력
SELECT *
FROM EMP
WHERE JOB LIKE '%A%';

-- 직업에 'N'가 들어간 사원 정보 출력
SELECT *
FROM EMP
WHERE JOB LIKE '%N%'; 

-- 추가수당이 없는 사원 정보 출력
SELECT *
FROM EMP
WHERE COMM IS NULL OR COMM = 0;

-- 지역이 NEW YORK이고 직업이 'SALESMAN'인 사원 정보 출력
SELECT *
FROM EMP, DEPT
WHERE DEPT.LOC = 'NEW YORK' AND EMP.JOB = 'SALESMAN';

-- 연간 총 수입이 30000 이상인 사원의 이름을 출력해보기 -> 아무도 안나온다. NULL
SELECT ENAME
FROM EMP
WHERE SAL*12+COMM >= 30000 OR SAL*12 >= 30000;

-- 연간 총 수입 출력해줄 열을 생성해서 총 수입 TOTAL_SALARY출력 (SAL:월급)
SELECT SAL*12+COMM AS TOTAL_SALARY
FROM EMP;

-- NVL (NULL VALUE) -> NVL(값, 대체값)
SELECT SAL*12+ NVL(COMM, 0) AS TOTAL_SALARY
FROM EMP;

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE SAL >= 2000 AND DEPTNO = 20
UNION
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE SAL >= 2000 AND DEPTNO = 30;

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE SAL >= 2000 AND DEPTNO = 20
UNION ALL
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE SAL >= 2000 AND DEPTNO = 20;

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 30
INTERSECT
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE JOB = 'SALESMAN';

SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
MINUS
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 10;
 
 -- 사원 이름이 5글자 이상인 애들 출력
 -- JOB을 3글자까지만 출력
 -- A가 들어간 직업 % 안쓰고 출력
 
SELECT *
FROM EMP
WHERE LENGTH(ENAME) >= 5;

SELECT EMPNO, ENAME, SUBSTR(JOB, 1, 3), MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP;

SELECT *
FROM EMP
WHERE INSTR(JOB, 'A', 1) > 0;

SELECT CONCAT('HELLO', 'WORLD') FROM DUAL;

SELECT LENGTH('HELLO') FROM DUAL;

SELECT LOWER('HELLO') FROM DUAL;

SELECT UPPER('hello') FROM DUAL;

SELECT SUBSTR('HELLO, WORLD', 1, 5) FROM DUAL;

SELECT INSTR('HELLO, WORLD', 'O', 1, 2) FROM DUAL;

SELECT REPLACE('HELLO WORLD', 'WORLD', 'world') FROM DUAL;

SELECT TRIM(BOTH 'H' FROM 'HELLO WORLD HH') FROM DUAL;

SELECT TRIM(LEADING 'O' FROM 'HELLO WORLD HH') FROM DUAL;

SELECT SYSDATE FROM DUAL;

SELECT EXTRACT(YEAR from HIREDATE) FROM EMP;

SELECT TO_DATE('2020/01/01', 'YYYY/MM/DD') FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL;

-- 직원들 입사 40주년이 언젠지 출력해보기
SELECT ADD_MONTHS(HIREDATE, 480)
FROM EMP;

-- 입사한지 42년차 되신 분들 출력
SELECT*
FROM EMP
WHERE EXTRACT(YEAR FROM HIREDATE) + 42 <= EXTRACT(YEAR FROM SYSDATE);

SELECT*
FROM EMP
WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, HIREDATE)) >= 42*12;

SELECT*
FROM EMP
WHERE TO_CHAR(SYSDATE, 'YYYY') = TO_CHAR(ADD_MONTHS(HIREDATE, 42*12), 'YYYY');

SELECT COALESCE('KIWI', 'APPLE', 'BANANA', 'ORANGE') FROM DUAL;

SELECT COALESCE(NULL, NULL, NULL, NULL) FROM DUAL;

SELECT COALESCE(NULL, NULL, 'APPLE', NULL) FROM DUAL;

SELECT EMPNO, ENAME, JOB, SAL, DECODE(JOB, 'MANAGER', SAL*1.1, 'SALESMAN', SAL*1.05, 'ANALYST', SAL*1.3, SAL) AS NEW_SAL
FROM EMP;

SELECT EMPNO, ENAME, SUBSTR(JOB, 1, 3) AS JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP
GROUP BY JOB;

SELECT*
FROM BONUS;

-- 추가 수당
SELECT ENAME, JOB, SAL, NVL2(COMM, '해당 사항 없음', '해당 사항 있음') AS COMM
FROM EMP;

SELECT SUM(SAL)
FROM EMP
WHERE JOB = 'MANAGER';

-- 30번 부서 인원
SELECT COUNT(*)
FROM EMP
WHERE DEPTNO = 30;

-- 제일 입사한지 오래된 인원 입사동기들
SELECT MIN(EXTRACT(YEAR FROM HIREDATE)) FROM EMP;

SELECT*
FROM EMP
WHERE EXTRACT(YEAR FROM HIREDATE) = (SELECT MIN(EXTRACT(YEAR FROM HIREDATE)) FROM EMP);

SELECT JOB, COUNT(*)
FROM EMP
GROUP BY JOB
HAVING COUNT(*) >= 3;

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY (DEPTNO, JOB);

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY ROLLUP(DEPTNO, JOB);

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB);

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS((DEPTNO, JOB), (DEPTNO), (JOB), ());

SELECT DEPTNO, JOB, SUM(SAL), GROUPING(DEPTNO), GROUPING(JOB)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)