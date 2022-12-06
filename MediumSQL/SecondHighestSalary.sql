{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 Menlo-Regular;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;}
{\colortbl;\red255\green255\blue255;\red255\green255\blue255;\red30\green30\blue30;\red235\green237\blue244;
\red255\green255\blue255;\red70\green137\blue204;\red202\green202\blue202;\red212\green214\blue154;\red167\green197\blue152;
}
{\*\expandedcolortbl;;\cssrgb\c100000\c100000\c100000;\cssrgb\c15686\c15686\c15686;\cssrgb\c93725\c94510\c96471\c74902;
\cssrgb\c100000\c100000\c100000\c7059;\cssrgb\c33725\c61176\c83922;\cssrgb\c83137\c83137\c83137;\cssrgb\c86275\c86275\c66667;\cssrgb\c70980\c80784\c65882;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sa240\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Table:\'a0
\f1\fs18 \cf4 \cb5 \strokec4 Employee
\f0\fs28 \cf2 \cb3 \strokec2 \
\pard\pardeftab720\partightenfactor0

\f1 \cf4 \cb5 \strokec4 +-------------+------+\
| Column Name | Type |\
+-------------+------+\
| id          | int  |\
| salary      | int  |\
+-------------+------+\
id is the primary key column for this table.\
Each row of this table contains information about the salary of an employee.\
\pard\pardeftab720\sa240\partightenfactor0

\f0 \cf2 \cb3 \strokec2 \'a0\
Write an SQL query to report the second highest salary from the\'a0
\f1\fs18 \cf4 \cb5 \strokec4 Employee
\f0\fs28 \cf2 \cb3 \strokec2 \'a0table. If there is no second highest salary, the query should report\'a0
\f1\fs18 \cf4 \cb5 \strokec4 null
\f0\fs28 \cf2 \cb3 \strokec2 .\
The query result format is in the following example.\
\'a0\
\pard\pardeftab720\sa240\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\partightenfactor0

\f3\b \cf2 \cb5 Input:
\f1\b0 \cf4 \strokec4  \
Employee table:\
+----+--------+\
| id | salary |\
+----+--------+\
| 1  | 100    |\
| 2  | 200    |\
| 3  | 300    |\
+----+--------+\

\f3\b \cf2 \strokec2 Output:
\f1\b0 \cf4 \strokec4  \
+---------------------+\
| SecondHighestSalary |\
+---------------------+\
| 200                 |\
+---------------------+\
\pard\pardeftab720\sa240\partightenfactor0

\f2\b \cf2 \cb3 \strokec2 Example 2:
\f0\b0 \
\pard\pardeftab720\partightenfactor0

\f3\b \cf2 \cb5 Input:
\f1\b0 \cf4 \strokec4  \
Employee table:\
+----+--------+\
| id | salary |\
+----+--------+\
| 1  | 100    |\
+----+--------+\

\f3\b \cf2 \strokec2 Output:
\f1\b0 \cf4 \strokec4  \
+---------------------+\
| SecondHighestSalary |\
+---------------------+\
| null                |\
+---------------------+\
\
\
\pard\pardeftab720\partightenfactor0

\fs26 \cf6 \cb3 \strokec6 SELECT\cf7 \strokec7  \cf8 \strokec8 IFNULL\cf7 \strokec7 ((\cf6 \strokec6 SELECT DISTINCT\cf7 \strokec7  salary  \cf6 \strokec6 FROM\cf7 \strokec7  Employee ORDER BY salary \cf6 \strokec6 DESC\cf7 \strokec7  \cf6 \strokec6 LIMIT\cf7 \strokec7  \cf9 \strokec9 1\cf7 \strokec7  OFFSET \cf9 \strokec9 1\cf7 \strokec7 ),\cf6 \strokec6 NULL\cf7 \strokec7 )AS SecondHighestSalary;\cb1 \
}