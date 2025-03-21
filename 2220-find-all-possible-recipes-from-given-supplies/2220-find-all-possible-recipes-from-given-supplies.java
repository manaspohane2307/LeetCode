class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String,List<String>> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        Set<String> supply = new HashSet<>(Arrays.asList(supplies));

        for(int i=0;i<recipes.length;i++){
            m2.put(recipes[i],0);
            for(String ing : ingredients.get(i)){
                if(!supply.contains(ing)){
                    m1.computeIfAbsent(ing,k-> new ArrayList<>()).add(recipes[i]);
                    m2.put(recipes[i],m2.getOrDefault(recipes[i],0)+1);
                }
            }
        }

        Queue<String> q = new LinkedList<>();
        for(Map.Entry<String,Integer>entry : m2.entrySet()){
            if(entry.getValue() == 0){
                q.offer(entry.getKey());
            }
        }

        List<String> res = new ArrayList<>();
        while(!q.isEmpty()){
            String curr = q.poll();
            res.add(curr);
            if(m1.containsKey(curr)){
                for(String next : m1.get(curr)){
                    m2.put(next,m2.get(next)-1);
                    if(m2.get(next)==0){
                        q.offer(next);
                    }
                }
            }
        }
        return res;
    }
}