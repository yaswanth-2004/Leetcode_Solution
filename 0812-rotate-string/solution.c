bool rotateString(char* s1, char* s2) {
    if(strlen(s1)!=strlen(s2)) return 0;
    char temp[strlen(s1)*2+1];
    return !!strstr(strcat(strcpy(temp,s1),s1),s2);
}
