## 动态规划
之前计算过得值不会重新计算
## 案例
10，9，4，5，3，4，101
###第0轮 10的最大长度值 
dp[0]=1
###第1轮 9的最大长度值 
9<10 dp[1]=1
###第2轮 4的最大长度值 
4<10 dp[2]=1
4<9 dp[2]=1
###第3轮 5的最大长度值 
5<10 dp[3]=1
5<9 dp[3]=1
5>4 dp[3]= dp[2]+1 = 2
###第4轮 3的最大长度值 
3<10 dp[4]=1
3<9 dp[4]=1
3<4 dp[4]=1
3<5 dp[4]=1
###第5轮 101的最大长度值 
101>10 dp[5]=dp[0]+1 = 2
101>9 dp[5]=dp[1]+1 = 2
101>4 dp[5]=dp[2]+1 = 2
101>5 dp[5]=dp[3]+1 = 3
101>3 dp[5]=Max(dp[3], dp[4]+1)=3