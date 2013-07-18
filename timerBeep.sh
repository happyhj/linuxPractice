#!/bin/bash
echo "타이머 시간을 입력하세요(초)"
read SECOND
while [ $SECOND -gt 0 ];
do 
	echo "${SECOND}초" 
	let SECOND=SECOND-1
	sleep 1
done
echo "설정하신 시간이 다 되었습니다."
echo  

