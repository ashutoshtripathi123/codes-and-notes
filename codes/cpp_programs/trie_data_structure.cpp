#include <bits/stdc++.h>
#include <iostream>
using namespace std;

#define ALPHABET 26

struct TrieNode
{
    struct TrieNode *children[ALPHABET];
    bool isEndOfWord;
};

//Create a new Trie Node
struct TrieNode* getNode()
{
    struct TrieNode *pTemp = new TrieNode();
    pTemp->isEndOfWord = false;
    //Each Node can have potentially 26 children, initializing each of them to NULL
    for (int i=0; i< ALPHABET; i++)
    {
        pTemp->children[i]=NULL;
    }

    return pTemp;
}

//Search for the Node, if it does not exist then create a new one
void insert(struct TrieNode *root, string key)
{
    struct TrieNode*temp=root;
    for(int i=0; i<key.length();i++)
    {
        int index = key[i] -'a';//we need to subtract 48 i.e. 'a' to convert char into index value as per ascii
        if (!temp->children[index])
        {
            temp->children[index] = getNode();
        }

        temp = temp->children[index];
    }

    //mark last node as complete word
    temp->isEndOfWord = true;
}

//Search if the key exists in the trie, and its a complete word
bool search(struct TrieNode *root, string key)
{
    struct TrieNode *temp = root;
    for (int i=0; i< key.length(); i++)
    {
        int index = key[i] - 'a';
        if (!temp->children[index])
        {
            //That means node does not exist, hence return
            return false;
        }
        temp = temp->children[index];
    }

    return (temp!=nullptr && temp->isEndOfWord);
}


int main()
{
    // Input keys (use only 'a' through 'z'
    // and lower case)
    string keys[] = {"the", "a", "there",
                    "answer", "any", "by",
                     "bye", "their" };
    int n = sizeof(keys)/sizeof(keys[0]);

    struct TrieNode *root = getNode();

    // Construct trie
    for (int i = 0; i < n; i++)
        insert(root, keys[i]);

    // Search for different keys
    search(root, "the")? cout << "Yes\n" :
                         cout << "No\n";
    search(root, "these")? cout << "Yes\n" :
                           cout << "No\n";
    return 0;
}






