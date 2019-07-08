#!/bin/bash
if screen -ls |grep 'minecraft'; then
echo 'stoping instances...'
killall screen
fi

echo 'starting instance'
screen -dm -S "minecraft" java -Xmx1024M -Xms1024M -jar server.jar nogui
echo 'success!'