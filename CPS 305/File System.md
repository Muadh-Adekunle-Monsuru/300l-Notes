It is a data structure that stores data and information on storage devices. It makes it easy for data and information that are stored on the devices to be easily retrieved. 

A file system organizes files and manages access to data. It is responsible for:
- File management
- Auxiliary storage management
- File integrity mechanisms
- Access methods. 

A file is creating a place within the memory. 

The most important part of file system is the method used to index the file on the hard-drive. It allows the OS to know where to find a specific file at any given time. It is typically based on the filename.  

Different OS uses different ways of storing and indexing files:
- Windows: 
	- **FAT**: *File Allocation Table*. 16 or 12 or 32 bit systems, uses FAT. Simple to implement and uses. But it is slow. It divides hard-disk into one or two partitions.
	- **NTFS**: *New Technology File System*. Uses binary tree. This is a new technology that allows fast access to the data and instruction that are stored in the file. It is built upon the features of FAT. It is a renewable FS, (keeps tracks of actions that has occurred of the file, ).  
	- **exFAT**: Lightweight FS which is used primarily in flash storage application and SD card. It has large file size and partition size limit. It can store files over 4gb
- MAC:
	- **HFS+**: Sometime known as Binary Tree, It uses B-Tree to index the files on the hard disk. Which means there would be fast access times. 
- LINUX: all uses B-Tree https://www.javatpoint.com/linux-file-system
	- exFS
	- jFS [[Linux file system]]

---
# Basic Operations on File System

- Create a file
- Rename a file
- Read
- Write
- Close
- Move location
- Copy 
- Delete
### File access method
Provides with method that can be used to access files stored on the storage device
- **Sequential access**: reads one byte at time,  one after the other. 
- **Direct access**: Read byte or a given block of information and data randomly
- **Record access**: File is in form of an array, fixed or variable size. Read in that way. 
- **Index Access**: One file contains the index to the records in another file. Applications can find a file based on the value that is in the index. Similar to database. 


#### Directories
 Folders provide a way for users to organize their files. Most filesystems support multiple level directories. Directories are group of folders in the same partition. 

Directory supports the notion of the current file system. 
