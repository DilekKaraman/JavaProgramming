package day10;

import java.util.Scanner;

public class Protocol {
    public static void main(String[] args) {
        /*HTTP is the protocol that governs communications between web-servers
and web clients. Part of the protocol includes a status code returned
by the server to tell the browser the status of its most recent page
request.
Some of the codes and their meanings are listed below:
status codes and their meanings:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
declare an int variable called statusCode, and a valid status
code is already given
write a program that prints out, on a line by itself, the
appropriate label from the above list based on status.
Example:
if status code = 200
output:
ok
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your status code:");
        int sc=scan.nextInt();
        String result=(sc==200)?"OK\n":(sc==201)?"Created":(sc==202)?"Accepted":(sc==301)?"Moved Permanently":(sc==303)?"See":
                (sc==304)?"Not Modified":(sc==307)?"Temporary Redirect":(sc==400)?"Bad Request":(sc==401)?"Unauthorized":
                        (sc==403)?"Forbidden":(sc==404)?"Not Found":(sc==410)?"Gone":(sc==500)?"Internal Server Error":
                                (sc==503)?"Service Unavailable":"Invalid";
        System.out.println(result);
    }
}
