import { useRouter } from 'next/router'
import Router from './next/Router'
function getCakeId(){
    const router=useRouter()
    const {cakeid}=router.query
    console.log(router.query);
    return(
        <div>
            Post
        </div>
    )
}
export default getCakeId