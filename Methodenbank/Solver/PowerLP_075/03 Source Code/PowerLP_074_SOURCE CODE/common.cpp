#include <io.h>
#include <stdio.h>
#include <sys\stat.h>
#include <fcntl.h>
#include <dir.h>
//------------------------------------------------------------------------------
void __fastcall strpncpy(char* dest, const char* src, unsigned int cnt) {
  strncpy(dest, src, cnt);
  dest[cnt-1] = 0;
}
//------------------------------------------------------------------------------
unsigned int __fastcall strplen(const char* str) {
  return strlen(str);
}
//------------------------------------------------------------------------------
char* __fastcall strreplace(char* str, const char* from, const char* to) {
  char* pos = strstr(str, from);
  int flen = strplen(from);
  int tlen = strplen(to);
  while (pos) {
    if (flen >= tlen) {
      memcpy(pos, to, tlen);
      pos+= tlen;
      strpncpy(pos, pos+(flen-tlen), strlen(pos)+1);
    } else {
      memcpy(pos+(tlen-flen), pos, strlen(pos)+1);
      memcpy(pos, to, tlen);
      pos+= tlen;
    }
    pos = strstr(pos, from);
  }
  return str;
}
//------------------------------------------------------------------------------
char* __fastcall trim(char* msg, char tc=' ') {
  while (msg[0] == tc) memcpy(msg, msg+1, strlen(msg));
  int len = strlen(msg)-1;
  while (len > 0 && msg[len] == tc) { msg[len] = 0; len--; }
  return msg;
}
//------------------------------------------------------------------------------
int __fastcall readLF(int file, char* buffer, long length) {
  int bread = read(file, buffer, length);    /* z.B. bread = Anz. der Zeichen
                                                     515 Zeichen Aufg. 1 erster Durchlauf
                                                     496 Zeichen Aufg. 1 zweiter Durchlauf
                                                 -> Reads from file
                                                Hier wird der Inhalt des Files
                                                in den 'buffer' gelesen ! */
  char* tmp = strchr((char*)buffer, '\r');   /* scans a string in the forward direction,
                                                looking for a specific character */
  if (tmp) tmp[0] = 0;
  else return 0;
  lseek(file, strlen((char*)buffer) + 2 - bread,SEEK_CUR);   /* Moves file pointer
                                                               SEEK_CUR	Current file pointer position */ 
  return bread;
}
//------------------------------------------------------------------------------
int __fastcall writeLF(int file, char* str) {
  int len = strlen(str);
  int bwritten = write(file, str, len);
  bwritten = write(file, "\r\n", 2);
  return bwritten;
}
//------------------------------------------------------------------------------
int __fastcall writeStr(int file, char* str) {
  int len = strlen(str);
  int bwritten = write(file, str, len);
  return bwritten;
}
//------------------------------------------------------------------------------
void __fastcall CheckSlash(char* dir) {
  if (dir[strplen(dir)-1] != '\\') strcat(dir, "\\");
}
//------------------------------------------------------------------------------

