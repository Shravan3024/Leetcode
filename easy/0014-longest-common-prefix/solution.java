            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);//Removes the last character 
                from the string prefix.

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
    }
        return prefix;
