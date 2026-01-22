class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        """
        Understand: 

        longest common prefix

        Match:
        String prefix
        Loop

        Pseudo Code:

        idx = 0
        max_prefix = false

        

        while not max_prefix and idx < len(strs[0]):
            prefix = strs[0].substring(0,idx)
            for str in strs:
                if prefix not in str:
                    max_prefix = true
            idx += 1

        Implement
        """

        idx = 0
        prefix = None

        while idx < len(strs[0]):
            idx += 1
            prefix = strs[0][0:idx]
            for string in strs:
                if not string.startswith(prefix):
                    idx -= 1
                    break

        return strs[0][0:idx]

        """
        Review:

        ["dog", "racecar", "car"]

        idx: 0
        mp: false
        prefix: ""

        idx: 1
        mp: false
        prefix: "f"

        idx: 2
        mp: false
        prefix: "fl"

        idx: 3
        mp: true
        prefix: "flo"

        """

