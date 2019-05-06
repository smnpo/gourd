  #!/bin/bash 

 git filter-branch  --force --env-filter ' 
     #如果Git用户名等于老的Git用户名 wangshuyin
     if [ "$GIT_COMMITTER_NAME" = "mingzhao" ] || [ "$GIT_AUTHOR_EMAIL" = "snaildev@outlook.com" ]; 
     then 
        #替换用户名为新的用户名，替换邮箱为正确的邮箱
        GIT_AUTHOR_NAME="snaildev"; 
        GIT_AUTHOR_EMAIL="snailtem@gmail.com"; 

        #替换提交的用户名为新的用户名，替换提交的邮箱为正确的邮箱
        GIT_COMMITTER_NAME="snaildev"; 
        GIT_COMMITTER_EMAIL="snailtem@gmail.com"; 
     fi 
 '  --tag-name-filter cat -- --branches --tags