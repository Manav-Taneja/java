import Head from 'next/head'
import Image from 'next/image'
import Link from 'next/link'
import styles from '../styles/Home.module.css'
import Cake from '../Cake'
import { Suspense } from 'react'
export default function Home() {
  var Cakelazy=React.lazy(()=>import('../Cake'))
  return (
    <div className={styles.container}>
    
          <Link href="/login">Login</Link>
         <Suspense>
          <Cakelazy></Cakelazy>
         </Suspense>
    </div>
  )
}
