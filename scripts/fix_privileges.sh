#!/usr/bin/env bash
chmod +x /home/ec2-user/Target/*.war
chmod +x /home/ec2-user/Target/server_start.sh
chmod +x /home/ec2-user/Target/server_stop.sh
sudo chmod o+w /home/ec2-user/apache-tomcat-9.0.71/webapps/
cp /home/ec2-user/Target/*.war /home/ec2-user/apache-tomcat-9.0.71/webapps/